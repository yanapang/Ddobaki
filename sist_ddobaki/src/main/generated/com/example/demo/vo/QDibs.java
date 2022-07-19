package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDibs is a Querydsl query type for Dibs
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDibs extends EntityPathBase<Dibs> {

    private static final long serialVersionUID = 847244561L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDibs dibs = new QDibs("dibs");

    public final NumberPath<Integer> dib_num = createNumber("dib_num", Integer.class);

    public final QPlace place;

    public final QUserInfo userinfo;

    public QDibs(String variable) {
        this(Dibs.class, forVariable(variable), INITS);
    }

    public QDibs(Path<? extends Dibs> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDibs(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDibs(PathMetadata metadata, PathInits inits) {
        this(Dibs.class, metadata, inits);
    }

    public QDibs(Class<? extends Dibs> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place")) : null;
        this.userinfo = inits.isInitialized("userinfo") ? new QUserInfo(forProperty("userinfo")) : null;
    }

}

