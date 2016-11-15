import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_attendee_contactForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendee/_contactForm.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(contactVO?.name)
printHtmlPart(1)
codecOut.print(contactVO?.username)
printHtmlPart(2)
codecOut.print(contactVO?.contactNumber)
printHtmlPart(3)
codecOut.print(contactVO?.address)
printHtmlPart(4)
codecOut.print(contactVO?.city)
printHtmlPart(5)
invokeTag('countrySelect','g',49,['type':("text"),'name':("country"),'id':("country"),'value':(contactVO?.country),'class':("form-control input-sm"),'placeholder':("country")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
