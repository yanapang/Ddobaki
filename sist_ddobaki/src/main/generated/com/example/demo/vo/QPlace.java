package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlace is a Querydsl query type for Place
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlace extends EntityPathBase<Place> {

    private static final long serialVersionUID = 505947884L;

    public static final QPlace place = new QPlace("place");

    public final ListPath<Board, QBoard> board = this.<Board, QBoard>createList("board", Board.class, QBoard.class, PathInits.DIRECT2);

    public final ListPath<Dibs, QDibs> dibs = this.<Dibs, QDibs>createList("dibs", Dibs.class, QDibs.class, PathInits.DIRECT2);

    public final StringPath place_addr = createString("place_addr");

    public final StringPath place_detail = createString("place_detail");

    public final StringPath place_explain = createString("place_explain");

    public final NumberPath<Integer> place_hit = createNumber("place_hit", Integer.class);

    public final StringPath place_lat = createString("place_lat");

    public final StringPath place_lng = createString("place_lng");

    public final NumberPath<Integer> place_meal = createNumber("place_meal", Integer.class);

    public final NumberPath<Integer> place_meal_price = createNumber("place_meal_price", Integer.class);

    public final StringPath place_name = createString("place_name");

    public final NumberPath<Integer> place_num = createNumber("place_num", Integer.class);

    public final NumberPath<Integer> place_park = createNumber("place_park", Integer.class);

    public final NumberPath<Integer> place_park_price = createNumber("place_park_price", Integer.class);

    public final NumberPath<Integer> place_region_num = createNumber("place_region_num", Integer.class);

    public final StringPath place_site = createString("place_site");

    public final NumberPath<Integer> place_spa = createNumber("place_spa", Integer.class);

    public final NumberPath<Integer> place_spa_price = createNumber("place_spa_price", Integer.class);

    public final StringPath place_tel = createString("place_tel");

    public final StringPath place_thumbnail = createString("place_thumbnail");

    public final NumberPath<Integer> place_type_num = createNumber("place_type_num", Integer.class);

    public final NumberPath<Integer> place_weight = createNumber("place_weight", Integer.class);

    public final ListPath<PlaceImage, QPlaceImage> placeImage = this.<PlaceImage, QPlaceImage>createList("placeImage", PlaceImage.class, QPlaceImage.class, PathInits.DIRECT2);

    public final ListPath<Plan, QPlan> plan = this.<Plan, QPlan>createList("plan", Plan.class, QPlan.class, PathInits.DIRECT2);

    public final ListPath<Reservation, QReservation> reservation = this.<Reservation, QReservation>createList("reservation", Reservation.class, QReservation.class, PathInits.DIRECT2);

    public final ListPath<Room, QRoom> room = this.<Room, QRoom>createList("room", Room.class, QRoom.class, PathInits.DIRECT2);

    public QPlace(String variable) {
        super(Place.class, forVariable(variable));
    }

    public QPlace(Path<? extends Place> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlace(PathMetadata metadata) {
        super(Place.class, metadata);
    }

}

