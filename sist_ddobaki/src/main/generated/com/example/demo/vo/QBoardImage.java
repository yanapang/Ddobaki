package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardImage is a Querydsl query type for BoardImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardImage extends EntityPathBase<BoardImage> {

    private static final long serialVersionUID = 1652605776L;

    public static final QBoardImage boardImage = new QBoardImage("boardImage");

    public final StringPath board_image_file = createString("board_image_file");

    public final NumberPath<Integer> board_image_num = createNumber("board_image_num", Integer.class);

    public final StringPath contentType = createString("contentType");

    public final StringPath file_path = createString("file_path");

    public final StringPath saved_name = createString("saved_name");

    public QBoardImage(String variable) {
        super(BoardImage.class, forVariable(variable));
    }

    public QBoardImage(Path<? extends BoardImage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardImage(PathMetadata metadata) {
        super(BoardImage.class, metadata);
    }

}

