import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_event_eventNavigation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/event/_eventNavigation.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(params.action=='list'|| params.action=='searchEvent'?'active':'')
printHtmlPart(1)
codecOut.print(createLink(controller: 'manageEvent', action: 'list'))
printHtmlPart(2)
codecOut.print((params.action=='eventAttendingList' || params.action=='searchAttendingEvent' || params.action=='addressList')?'active':'')
printHtmlPart(1)
codecOut.print(createLink(controller: 'manageEvent', action: 'eventAttendingList'))
printHtmlPart(3)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
