import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_eventeventAttendeeList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/eventAttendeeList.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(4)
for( eventAttendee in (eventAttendeeList) ) {
printHtmlPart(5)
codecOut.print(eventAttendee.attendee.name)
printHtmlPart(6)
codecOut.print(eventAttendee.attendee.email)
printHtmlPart(6)
codecOut.print(eventAttendee.attendee.city)
printHtmlPart(6)
codecOut.print(eventAttendee.attendee.mobileNumber)
printHtmlPart(6)
codecOut.print(eventAttendee.attendee.country)
printHtmlPart(6)
codecOut.print(eventAttendee.attendee.email)
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',38,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-primary disabled")],3)
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',40,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-default disabled")],3)
printHtmlPart(9)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',42,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-primary disabled")],3)
printHtmlPart(9)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',44,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-default disabled")],3)
printHtmlPart(9)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',47,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-default disabled"),'style':("margin-top: 5px")],3)
printHtmlPart(9)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',49,['controller':("attendee"),'action':("attendeeDetails"),'class':("btn btn-xs btn-danger disabled"),'style':("margin-top: 5px")],3)
printHtmlPart(15)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
