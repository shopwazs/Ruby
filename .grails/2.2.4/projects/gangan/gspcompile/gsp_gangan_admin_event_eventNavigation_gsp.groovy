import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_event_eventNavigation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/event/_eventNavigation.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(params.action == 'list'? 'acive' : '')
printHtmlPart(1)
codecOut.print(createLink(controller: 'event',action: 'list'))
printHtmlPart(2)
invokeTag('message','g',4,['code':("default.link.skip.label"),'default':("Event list")],-1)
printHtmlPart(3)
codecOut.print(params.action == 'create' ? 'active' : '')
printHtmlPart(4)
codecOut.print(createLink(controller: 'event', action: 'create'))
printHtmlPart(5)
invokeTag('message','g',6,['code':("default.event.new.label"),'default':("Create event"),'args':([entityName])],-1)
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
