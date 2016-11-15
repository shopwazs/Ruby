import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventbidItem_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/bidItem.gsp" }
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
codecOut.print(flash.message)
printHtmlPart(6)
invokeTag('star','gan',28,[:],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',73,['controller':("#"),'action':("#"),'style':("color: dodgerblue"),'class':("glyphicon glyphicon-plus")],3)
printHtmlPart(9)
invokeTag('star','gan',81,[:],-1)
printHtmlPart(10)
invokeTag('select','g',86,['from':(['M', 'T', 'W']),'name':("categoryName"),'class':("form-control"),'style':("border-color: dodgerblue;margin-top: 0em")],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',103,['class':("glyphicon glyphicon-play-circle"),'controller':("#"),'action':("#"),'style':("color: dodgerblue")],3)
invokeTag('star','gan',103,[:],-1)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',110,['class':("glyphicon glyphicon-play-circle"),'controller':("#"),'action':("#"),'style':("color: dodgerblue")],3)
invokeTag('star','gan',110,[:],-1)
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',121,['class':("glyphicon glyphicon-play-circle"),'controller':("#"),'action':("#"),'style':("color: dodgerblue")],3)
invokeTag('star','gan',121,[:],-1)
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',140,['controller':("#"),'action':("#"),'class':("btn btn-primary col-md-4")],3)
printHtmlPart(19)
codecOut.print(event?.id)
printHtmlPart(20)
codecOut.print(eventAgenda?.id)
printHtmlPart(21)
})
invokeTag('form','g',151,['controller':("manageEvent"),'action':("postBid")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',153,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
