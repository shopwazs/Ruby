import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendeelistContact_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/listContact.gsp" }
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
loop:{
int i = 0
for( contact in (contactList) ) {
printHtmlPart(6)
invokeTag('checkBox','g',34,['name':("cbResult"),'value':(contact.id)],-1)
printHtmlPart(7)
codecOut.print(contact?.name)
printHtmlPart(7)
codecOut.print(contact?.username)
printHtmlPart(7)
codecOut.print(contact?.contactNumber)
printHtmlPart(7)
codecOut.print(contact?.city)
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
codecOut.print(eventId)
printHtmlPart(10)
})
invokeTag('form','g',48,['controller':("attendee"),'action':("postInvitation")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
