/**
 * CARIS oscar - Open Spatial Component ARchitecture
 *
 * Copyright 2013 CARIS <http://www.caris.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.caris.oscarexchange4j.theme.exceptions;
/*
 * WEB-1005 - Class created to handle validation exceptions.
 */
/**
 * @author tcoburn
 * 
 */
public class ValidationException extends Exception {

    /**
     * serial version unique identifier
     */
    private static final long serialVersionUID = 7904615838678640228L;

    public ValidationException() {
        super();
    }

    public ValidationException(String message) {
        super(message);
    }
}
