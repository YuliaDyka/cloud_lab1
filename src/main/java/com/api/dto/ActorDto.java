package com.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Builder
@Getter
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(itemRelation = "actor", collectionRelation = "actors")
public class ActorDto extends RepresentationModel<ActorDto> {
    private Integer id;
    private String full_name;
    private Integer age;
}
