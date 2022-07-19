package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReservationViewId is a Querydsl query type for ReservationViewId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QReservationViewId extends BeanPath<ReservationViewId> {

    private static final long serialVersionUID = -197463055L;

    public static final QReservationViewId reservationViewId = new QReservationViewId("reservationViewId");

    public final StringPath place_name = createString("place_name");

    public final StringPath room_name = createString("room_name");

    public QReservationViewId(String variable) {
        super(ReservationViewId.class, forVariable(variable));
    }

    public QReservationViewId(Path<? extends ReservationViewId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReservationViewId(PathMetadata metadata) {
        super(ReservationViewId.class, metadata);
    }

}

