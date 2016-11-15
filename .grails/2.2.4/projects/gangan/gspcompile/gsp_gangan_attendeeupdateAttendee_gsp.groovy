import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendeeupdateAttendee_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/updateAttendee.gsp" }
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
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',11,['bean':(attendeeVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',13,['bean':(attendeeVO)],2)
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',15,[:],-1)
printHtmlPart(6)
invokeTag('render','g',18,['template':("/user/manageAttendee"),'model':([account: account])],-1)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
codecOut.print(flash.clear())
printHtmlPart(10)
codecOut.print(attendeeVO?.phoneNumber)
printHtmlPart(11)
codecOut.print(attendeeVO?.mobileNumber)
printHtmlPart(12)
codecOut.print(attendeeVO?.faxNumber)
printHtmlPart(13)
codecOut.print(attendeeVO?.building)
printHtmlPart(14)
codecOut.print(attendeeVO?.room)
printHtmlPart(15)
codecOut.print(attendeeVO?.zipCode)
printHtmlPart(16)
codecOut.print(attendeeVO?.state)
printHtmlPart(17)
codecOut.print(attendeeVO?.website)
printHtmlPart(18)
codecOut.print(attendeeVO?.eventItems)
printHtmlPart(19)
codecOut.print(attendeeVO?.subscriptions)
printHtmlPart(20)
codecOut.print(attendeeVO?.paymentOptions)
printHtmlPart(21)
})
invokeTag('form','g',159,['role':("form"),'controller':("home"),'action':("updateAttendee"),'method':("post")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',162,[:],1)
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
