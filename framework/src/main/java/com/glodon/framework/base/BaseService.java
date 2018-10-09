package com.glodon.framework.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface BaseService {

    default Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }

}
