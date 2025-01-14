/*
 * Copyright 2006-2014 the original author or authors.
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

package com.consol.citrus.config.xml;

import com.consol.citrus.config.util.BeanDefinitionParserUtils;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @author Christoph Deppisch
 */
public abstract class AbstractChannelEndpointParser extends AbstractEndpointParser {

    @Override
    protected void parseEndpointConfiguration(BeanDefinitionBuilder endpointConfiguration, Element element, ParserContext parserContext) {
        super.parseEndpointConfiguration(endpointConfiguration, element, parserContext);

        BeanDefinitionParserUtils.setPropertyReference(endpointConfiguration,
                element.getAttribute("channel"), "channel");

        BeanDefinitionParserUtils.setPropertyReference(endpointConfiguration,
                element.getAttribute("messaging-template"), "messagingTemplate");

        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration,
                element.getAttribute("channel-name"), "channelName");

        BeanDefinitionParserUtils.setPropertyReference(endpointConfiguration,
                element.getAttribute("channel-resolver"), "channelResolver");

        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration,
                element.getAttribute("use-object-messages"), "useObjectMessages");

        BeanDefinitionParserUtils.setPropertyValue(endpointConfiguration,
                element.getAttribute("filter-internal-headers"), "filterInternalHeaders");
    }
}
