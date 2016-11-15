import com.gangan.event.Event
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_eventlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/event/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'event.label', default: 'Event'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',13,['template':("/admin/event/eventNavigation")],-1)
printHtmlPart(5)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',25,['property':("name"),'title':(message(code: 'event.name.label', default: 'Name'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',27,['property':("status"),'title':(message(code: 'event.status.label', default: 'Status'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',30,['property':("description"),'title':(message(code: 'event.description.label', default: 'Description'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',32,['property':("type"),'title':(message(code: 'event.type.label', default: 'Type'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',34,['property':("kind"),'title':(message(code: 'event.kind.label', default: 'Kind'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',37,['property':("occurrence"),'title':(message(code: 'event.occurrence.label', default: 'Occurrence'))],-1)
printHtmlPart(11)
loop:{
int i = 0
for( eventInstance in (eventInstanceList) ) {
printHtmlPart(12)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
createTagBody(3, {->
codecOut.print(fieldValue(bean: eventInstance, field: "name"))
})
invokeTag('link','g',46,['action':("show"),'id':(eventInstance.id)],3)
printHtmlPart(14)
codecOut.print(fieldValue(bean: eventInstance, field: "status"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: eventInstance, field: "description"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: eventInstance, field: "type"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: eventInstance, field: "kind"))
printHtmlPart(14)
codecOut.print(fieldValue(bean: eventInstance, field: "occurrence"))
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',59,['class':("btn btn-xs btn-default"),'controller':("event"),'action':("edit"),'params':([id: eventInstance?.id])],3)
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',61,['class':("btn btn-xs btn-danger"),'controller':("event"),'action':("delete"),'params':([id: eventInstance?.id])],3)
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',70,['total':(eventInstanceTotal)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
