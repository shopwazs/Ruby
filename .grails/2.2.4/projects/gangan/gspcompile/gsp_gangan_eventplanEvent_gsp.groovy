import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventplanEvent_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/planEvent.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('countrySelect','g',33,['class':("form-control"),'name':("countryName"),'style':("width: 114%;margin-top: 0em")],-1)
printHtmlPart(6)
invokeTag('select','g',44,['class':("form-control"),'from':(['noida', 'delhi', 'paris']),'name':("city"),'style':("width: 114%;margin-top: 0em")],-1)
printHtmlPart(7)
invokeTag('select','g',55,['from':(['12', '14', '15']),'class':("form-control"),'name':("distance"),'style':("width: 114%;margin-top: 0em")],-1)
printHtmlPart(8)
invokeTag('select','g',66,['from':(['1000', '2000', '3000']),'class':("form-control"),'name':("priceRange"),'style':("width: 114%;margin-top: 0em")],-1)
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
codecOut.print(2)
printHtmlPart(11)
})
invokeTag('link','g',124,['controller':("manageEvent"),'action':("basketItems")],3)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
codecOut.print(2)
printHtmlPart(14)
})
invokeTag('link','g',129,['controller':("manageEvent"),'action':("#")],3)
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',133,['controller':("manageEvent"),'action':("#"),'class':("btn btn-xs btn-success")],3)
printHtmlPart(17)
})
invokeTag('form','g',141,['controller':("#"),'action':("#")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',143,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392468335000L
public static final String DEFAULT_CODEC = null
}
