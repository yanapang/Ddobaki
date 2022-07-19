package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserInfo is a Querydsl query type for UserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInfo extends EntityPathBase<UserInfo> {

    private static final long serialVersionUID = -472476908L;

    public static final QUserInfo userInfo = new QUserInfo("userInfo");

    public final ListPath<Board, QBoard> board = this.<Board, QBoard>createList("board", Board.class, QBoard.class, PathInits.DIRECT2);

    public final ListPath<Dibs, QDibs> dibs = this.<Dibs, QDibs>createList("dibs", Dibs.class, QDibs.class, PathInits.DIRECT2);

    public final ListPath<Dog, QDog> dog = this.<Dog, QDog>createList("dog", Dog.class, QDog.class, PathInits.DIRECT2);

    public final ListPath<Payment, QPayment> payment = this.<Payment, QPayment>createList("payment", Payment.class, QPayment.class, PathInits.DIRECT2);

    public final ListPath<Plan, QPlan> plan = this.<Plan, QPlan>createList("plan", Plan.class, QPlan.class, PathInits.DIRECT2);

    public final ListPath<Reply, QReply> reply = this.<Reply, QReply>createList("reply", Reply.class, QReply.class, PathInits.DIRECT2);

    public final ListPath<Reservation, QReservation> reservation = this.<Reservation, QReservation>createList("reservation", Reservation.class, QReservation.class, PathInits.DIRECT2);

    public final StringPath user_file = createString("user_file");

    public final StringPath user_id = createString("user_id");

    public final StringPath user_nick = createString("user_nick");

    public final NumberPath<Integer> user_num = createNumber("user_num", Integer.class);

    public final StringPath user_phone = createString("user_phone");

    public final StringPath user_pwd = createString("user_pwd");

    public final StringPath user_role = createString("user_role");

    public QUserInfo(String variable) {
        super(UserInfo.class, forVariable(variable));
    }

    public QUserInfo(Path<? extends UserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfo(PathMetadata metadata) {
        super(UserInfo.class, metadata);
    }

}

