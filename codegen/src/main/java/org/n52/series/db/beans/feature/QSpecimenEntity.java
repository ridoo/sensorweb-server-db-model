package org.n52.series.db.beans.feature;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QSpecimenEntity is a Querydsl query type for SpecimenEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSpecimenEntity extends EntityPathBase<SpecimenEntity> {

    private static final long serialVersionUID = -1311841356L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSpecimenEntity specimenEntity = new QSpecimenEntity("specimenEntity");

    public final org.n52.series.db.beans.QFeatureEntity _super;

    //inherited
    public final SetPath<org.n52.series.db.beans.AbstractFeatureEntity<?>, org.n52.series.db.beans.QAbstractFeatureEntity> children;

    public final StringPath currentLocation = createString("currentLocation");

    //inherited
    public final StringPath description;

    // inherited
    public final org.n52.series.db.beans.QFormatEntity featureType;

    // inherited
    public final org.n52.series.db.beans.QGeometryEntity geometryEntity;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath identifier;

    // inherited
    public final org.n52.series.db.beans.QCodespaceEntity identifierCodespace;

    public final StringPath materialClass = createString("materialClass");

    //inherited
    public final StringPath name;

    // inherited
    public final org.n52.series.db.beans.QCodespaceEntity nameCodespace;

    //inherited
    public final SetPath<org.n52.series.db.beans.parameter.Parameter<?>, org.n52.series.db.beans.parameter.QParameter> parameters;

    //inherited
    public final SetPath<org.n52.series.db.beans.AbstractFeatureEntity<?>, org.n52.series.db.beans.QAbstractFeatureEntity> parents;

    public final StringPath samplingMethod = createString("samplingMethod");

    public final DateTimePath<java.util.Date> samplingTimeEnd = createDateTime("samplingTimeEnd", java.util.Date.class);

    public final DateTimePath<java.util.Date> samplingTimeStart = createDateTime("samplingTimeStart", java.util.Date.class);

    public final NumberPath<Double> size = createNumber("size", Double.class);

    public final org.n52.series.db.beans.QUnitEntity sizeUnit;

    public final StringPath specimenType = createString("specimenType");

    //inherited
    public final SetPath<org.n52.series.db.beans.i18n.I18nFeatureEntity, org.n52.series.db.beans.i18n.QI18nFeatureEntity> translations;

    //inherited
    public final StringPath url;

    //inherited
    public final StringPath xml;

    public QSpecimenEntity(String variable) {
        this(SpecimenEntity.class, forVariable(variable), INITS);
    }

    public QSpecimenEntity(Path<? extends SpecimenEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSpecimenEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSpecimenEntity(PathMetadata metadata, PathInits inits) {
        this(SpecimenEntity.class, metadata, inits);
    }

    public QSpecimenEntity(Class<? extends SpecimenEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new org.n52.series.db.beans.QFeatureEntity(type, metadata, inits);
        this.children = _super.children;
        this.description = _super.description;
        this.featureType = _super.featureType;
        this.geometryEntity = _super.geometryEntity;
        this.id = _super.id;
        this.identifier = _super.identifier;
        this.identifierCodespace = _super.identifierCodespace;
        this.name = _super.name;
        this.nameCodespace = _super.nameCodespace;
        this.parameters = _super.parameters;
        this.parents = _super.parents;
        this.sizeUnit = inits.isInitialized("sizeUnit") ? new org.n52.series.db.beans.QUnitEntity(forProperty("sizeUnit")) : null;
        this.translations = _super.translations;
        this.url = _super.url;
        this.xml = _super.xml;
    }

}

