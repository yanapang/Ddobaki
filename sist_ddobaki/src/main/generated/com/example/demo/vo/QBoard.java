package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = 493108427L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final NumberPath<Integer> board_num = createNumber("board_num", Integer.class);

    public final QPlace place;

    public final StringPath post_content = createString("post_content");

    public final NumberPath<Integer> post_hit = createNumber("post_hit", Integer.class);

    public final NumberPath<Integer> post_num = createNumber("post_num", Integer.class);

    public final DatePath<java.util.Date> post_regdate = createDate("post_regdate", java.util.Date.class);

    public final StringPath post_title = createString("post_title");

    public final ListPath<Reply, QReply> reply = this.<Reply, QReply>createList("reply", Reply.class, QReply.class, PathInits.DIRECT2);

    public final QUserInfo userinfo;

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place")) : null;
        this.userinfo = inits.isInitialized("userinfo") ? new QUserInfo(forProperty("userinfo")) : null;
    }

}

