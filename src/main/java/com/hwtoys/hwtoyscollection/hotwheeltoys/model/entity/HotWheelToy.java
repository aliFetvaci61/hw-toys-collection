package com.hwtoys.hwtoyscollection.hotwheeltoys.model.entity;


import com.hwtoys.hwtoyscollection.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "hotwheeltoy")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@SequenceGenerator(name = "default_seq_gen", sequenceName = "hotwheeltoy_id_seq", allocationSize = 1)
public class HotWheelToy extends BaseEntity {


    private String year;

    private String type;

    private String subType;

    @Column(unique = true)
    private String toyCode;

    private String columnNumber;

    private String modelName;

    private String series;

    private String seriesNumber;

    private String photoUrl;

    private String photoUrlT;
}
