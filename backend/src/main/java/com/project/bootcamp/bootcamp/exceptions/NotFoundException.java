package com.project.bootcamp.bootcamp.exceptions;

import com.project.bootcamp.bootcamp.util.MessageUtils;

public class NotFoundException  extends  RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
