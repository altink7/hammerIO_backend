package at.altin.hammerio.config.mapper;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapper class to map DTOs to Entities and vice versa,
 * The Naming convention is that the DTOs are in the package dto and the Entities in the package entity
 * The DTOs and Entities have to have the same name, except the DTOs have to end with DTO
 *
 */
@Component
@SuppressWarnings({"unchecked", "unused"})
public class AppMapper {
    private static final String DTO_PACKAGE = "at.altin.hammerio.dto.";
    private static final String ENTITY_PACKAGE = "at.altin.hammerio.entity.";
    ModelMapperConfig appModelMapper;


    public AppMapper(ModelMapperConfig appModelMapper) {
        this.appModelMapper = appModelMapper;
    }


    public <DTO, E> E mapToEntity(DTO source) {
        Class<E> targetClass = getTargetClassForEntity(source);
        return appModelMapper.modelMapper().map(source, targetClass);
    }

    public <E, DTO> DTO mapToDTO(E source) {
        Class<DTO> targetClass = getTargetClassForDTO(source);
        return appModelMapper.modelMapper().map(source, targetClass);
    }

    public <DTO, E> List<E> mapCollectionToEntities(Collection<DTO> dtoCollection) {
        return (List<E>) dtoCollection.stream()
                .map(this::mapToEntity)
                .collect(Collectors.toList());
    }

    public <E, DTO> List<DTO> mapCollectionToDTOs(Collection<E> entityCollection) {
        return (List<DTO>) entityCollection.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private <DTO, E> Class<E> getTargetClassForEntity(DTO source) {
        String entityClassName = ENTITY_PACKAGE + source.getClass().getSimpleName().replace("DTO", "");
        return getClassByName(entityClassName);
    }

    private <E, DTO> Class<DTO> getTargetClassForDTO(E source) {
        String dtoClassName = DTO_PACKAGE + source.getClass().getSimpleName() + "DTO";
        return getClassByName(dtoClassName);
    }

    private <T> Class<T> getClassByName(String className) {
        try {
            return (Class<T>) Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class not found: " + className, e);
        }
    }
}
