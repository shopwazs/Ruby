import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendeemanageContacts_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/manageContacts.gsp" }
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
createClosureForHtmlPart(5, 2)
invokeTag('link','g',22,['controller':("attendee"),'action':("createContact"),'class':("btn btn-xs btn-primary"),'style':("margin-left:800px ")],2)
printHtmlPart(6)
loop:{
int i = 0
for( contact in (contactList) ) {
printHtmlPart(7)
codecOut.print(contact?.name)
printHtmlPart(8)
codecOut.print(contact?.username)
printHtmlPart(8)
codecOut.print(contact?.contactNumber)
printHtmlPart(8)
codecOut.print(contact?.address)
printHtmlPart(8)
codecOut.print(contact?.city)
printHtmlPart(9)
codecOut.print(createLink(controller: 'attendee', action: 'editContact', params: [contactId: contact?.id]))
printHtmlPart(10)
codecOut.print(createLink(controller: 'attendee', action: 'deleteContact', params: [contactId: contact?.id]))
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
