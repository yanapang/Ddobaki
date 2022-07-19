package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = 136696305L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final QPayment payment;

    public final QPlace place;

    public final DatePath<java.util.Date> reservation_checkin_date = createDate("reservation_checkin_date", java.util.Date.class);

    public final DatePath<java.util.Date> reservation_checkout_date = createDate("reservation_checkout_date", java.util.Date.class);

    public final NumberPath<Integer> reservation_l_dog_cnt = createNumber("reservation_l_dog_cnt", Integer.class);

    public final NumberPath<Integer> reservation_m_dog_cnt = createNumber("reservation_m_dog_cnt", Integer.class);

    public final NumberPath<Integer> reservation_meal_cnt = createNumber("reservation_meal_cnt", Integer.class);

    public final NumberPath<Integer> reservation_num = createNumber("reservation_num", Integer.class);

    public final NumberPath<Integer> reservation_park = createNumber("reservation_park", Integer.class);

    public final NumberPath<Integer> reservation_people_cnt = createNumber("reservation_people_cnt", Integer.class);

    public final NumberPath<Integer> reservation_price = createNumber("reservation_price", Integer.class);

    public final NumberPath<Integer> reservation_s_dog_cnt = createNumber("reservation_s_dog_cnt", Integer.class);

    public final NumberPath<Integer> reservation_spa = createNumber("reservation_spa", Integer.class);

    public final QRoom room;

    public final QUserInfo userinfo;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.payment = inits.isInitialized("payment") ? new QPayment(forProperty("payment"), inits.get("payment")) : null;
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place")) : null;
        this.room = inits.isInitialized("room") ? new QRoom(forProperty("room"), inits.get("room")) : null;
        this.userinfo = inits.isInitialized("userinfo") ? new QUserInfo(forProperty("userinfo")) : null;
    }

}

