/*
 * Copyright 2012-2013 Donghwan Kim
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.flowersinthesand.portal.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.flowersinthesand.portal.spi.ObjectFactory;

public class NewObjectFactory implements ObjectFactory {

	private final Logger logger = LoggerFactory.getLogger(NewObjectFactory.class);

	@Override
	public <T> T create(String name, Class<T> clazz) {
		try {
			return (T) clazz.newInstance();
		} catch (Exception e) {
			logger.error("Failed to create the bean " + clazz.getName(), e);
		}

		return null;
	}

}
