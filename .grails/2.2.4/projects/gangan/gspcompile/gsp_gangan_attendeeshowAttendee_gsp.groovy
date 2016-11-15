import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendeeshowAttendee_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/showAttendee.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(4)
invokeTag('render','g',12,['template':("/user/manageAttendee"),'model':([account: account])],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
codecOut.print(flash.message)
printHtmlPart(7)
codecOut.print(flash.clear())
printHtmlPart(8)
codecOut.print(attendee?.phoneNumber)
printHtmlPart(9)
codecOut.print(attendee?.mobileNumber)
printHtmlPart(10)
codecOut.print(attendee?.faxNumber)
printHtmlPart(11)
codecOut.print(attendee?.building)
printHtmlPart(12)
codecOut.print(attendee?.room)
printHtmlPart(13)
codecOut.print(attendee?.zipCode)
printHtmlPart(14)
codecOut.print(attendee?.state)
printHtmlPart(15)
codecOut.print(attendee?.website)
printHtmlPart(16)
codecOut.print(attendee?.eventItems)
printHtmlPart(17)
codecOut.print(attendee?.subscriptions)
printHtmlPart(18)
codecOut.print(attendee?.paymentOptions)
printHtmlPart(19)
})
invokeTag('form','g',172,['role':("form"),'controller':("home"),'action':("updateAttendee"),'method':("post")],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',175,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
