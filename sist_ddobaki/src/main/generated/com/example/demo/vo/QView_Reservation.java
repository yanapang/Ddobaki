package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QView_Reservation is a Querydsl query type for View_Reservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QView_Reservation extends EntityPathBase<View_Reservation> {

    private static final long serialVersionUID = -1396034035L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QView_Reservation view_Reservation = new QView_Reservation("view_Reservation");

    public final QReservationViewId id;

    public final NumberPath<Integer> place_meal = createNumber("place_meal", Integer.class);

    public final NumberPath<Integer> place_meal_price = createNumber("place_meal_price", Integer.class);

    public final NumberPath<Integer> place_park = createNumber("place_park", Integer.class);

    public final NumberPath<Integer> place_parking_price = createNumber("place_parking_price", Integer.class);

    public final NumberPath<Integer> place_spa = createNumber("place_spa", Integer.class);

    public final NumberPath<Integer> place_spa_price = createNumber("place_spa_price", Integer.class);

    public final NumberPath<Integer> place_weight = createNumber("place_weight", Integer.class);

    public QView_Reservation(String variable) {
        this(View_Reservation.class, forVariable(variable), INITS);
    }

    public QView_Reservation(Path<? extends View_Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QView_Reservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QView_Reservation(PathMetadata metadata, PathInits inits) {
        this(View_Reservation.class, metadata, inits);
    }

    public QView_Reservation(Class<? extends View_Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QReservationViewId(forProperty("id")) : null;
    }

}

