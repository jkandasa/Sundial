/**
 * Copyright 2011 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.sundial.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author timmolter
 * @version $Revision: 1.1 $ $Date: 2010/08/23 05:29:14 $ $Author: xeiam $
 */
public class GenericJobException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /** slf4J logger wrapper */
    Logger logger = LoggerFactory.getLogger(GenericJobException.class);

    /**
     * Constructor to use when a business error occurs and the Job needs to stop, no real runtime exception
     * 
     * @param pMessage
     */
    public GenericJobException(String pMessage) {
        logger.error(pMessage);
    }

    /**
     * Constructor to use when a real runtime exception occurs
     * 
     * @param pMessage
     * @param e
     */
    public GenericJobException(String pMessage, Throwable e) {
        logger.error(pMessage, e);
    }

}
