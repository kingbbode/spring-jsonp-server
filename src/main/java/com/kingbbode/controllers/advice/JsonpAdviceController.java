package com.kingbbode.controllers.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by YG-MAC on 2016. 12. 18..
 */
@ControllerAdvice
public class JsonpAdviceController extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdviceController() {
        super("callback");
    }
}
