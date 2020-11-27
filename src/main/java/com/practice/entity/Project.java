package com.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity {

    private String projectName;
    private String projectCode;
    private String assignedManager;
    private String projectDetail;
}
