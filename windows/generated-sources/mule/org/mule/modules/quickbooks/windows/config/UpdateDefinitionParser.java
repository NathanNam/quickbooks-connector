
package org.mule.modules.quickbooks.windows.config;

import javax.annotation.Generated;
import org.mule.modules.quickbooks.windows.processors.UpdateMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T02:51:05-05:00", comments = "Build 3.4.3.1620.30ea288")
public class UpdateDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(UpdateMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "accessTokenId", "accessTokenId");
        parseProperty(builder, element, "type", "type");
        if (hasAttribute(element, "entityObject-ref")) {
            if (element.getAttribute("entityObject-ref").startsWith("#")) {
                builder.addPropertyValue("entityObject", element.getAttribute("entityObject-ref"));
            } else {
                builder.addPropertyValue("entityObject", (("#[registry:"+ element.getAttribute("entityObject-ref"))+"]"));
            }
        }
        parseProperty(builder, element, "draft", "draft");
        parseProperty(builder, element, "fullResponse", "fullResponse");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
