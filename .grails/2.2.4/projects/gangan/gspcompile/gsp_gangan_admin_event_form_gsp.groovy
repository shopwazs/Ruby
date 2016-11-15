import com.gangan.event.EventItem
import  com.gangan.event.Event
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_event_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/event/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: eventInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("event.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',14,['class':("form-control"),'name':("name"),'required':(""),'value':(eventInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: eventInstance, field: 'startDate', 'error'))
printHtmlPart(4)
invokeTag('message','g',20,['code':("event.datepicker.label"),'default':("Start Date")],-1)
printHtmlPart(5)
codecOut.print(eventInstance?.startDate)
printHtmlPart(6)
codecOut.print(hasErrors(bean: eventInstance, field: 'occurrence', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("event.occurance.label"),'default':("Occurance")],-1)
printHtmlPart(8)
codecOut.print(hasErrors(bean: eventInstance, field: 'startTime', 'error'))
printHtmlPart(9)
invokeTag('message','g',43,['code':("event.startTime.label"),'default':("Start Time")],-1)
printHtmlPart(10)
codecOut.print(hasErrors(bean: eventInstance, field: 'venue', 'error'))
printHtmlPart(11)
invokeTag('message','g',53,['code':("event.venue.label"),'default':("Venue")],-1)
printHtmlPart(12)
codecOut.print(eventInstance?.venue)
printHtmlPart(13)
codecOut.print(hasErrors(bean: eventInstance, field: 'cost', 'error'))
printHtmlPart(14)
invokeTag('message','g',68,['code':("event.cost.label"),'default':("Cost")],-1)
printHtmlPart(15)
codecOut.print(eventInstance?.cost)
printHtmlPart(16)
codecOut.print(hasErrors(bean: eventInstance, field: 'description', 'error'))
printHtmlPart(17)
invokeTag('message','g',78,['code':("event.description.label"),'default':("Description")],-1)
printHtmlPart(18)
codecOut.print(eventInstance?.description)
printHtmlPart(16)
codecOut.print(hasErrors(bean: eventInstance, field: 'discount', 'error'))
printHtmlPart(19)
invokeTag('message','g',90,['code':("event.discount.label"),'default':("Discount")],-1)
printHtmlPart(20)
codecOut.print(eventInstance?.discount)
printHtmlPart(21)
codecOut.print(hasErrors(bean: eventInstance, field: 'paymentOptions', 'error'))
printHtmlPart(22)
invokeTag('message','g',101,['code':("event.paymentOptions.label"),'default':("Payment Options")],-1)
printHtmlPart(23)
codecOut.print(eventInstance?.paymentOptions)
printHtmlPart(24)
codecOut.print(hasErrors(bean: eventInstance, field: 'status', 'error'))
printHtmlPart(25)
invokeTag('message','g',114,['code':("event.status.label"),'default':("Status")],-1)
printHtmlPart(26)
invokeTag('select','g',120,['from':(['Planned', 'Ongoing', 'Done']),'name':("status"),'id':("status"),'class':("form-control"),'value':(eventInstance?.status)],-1)
printHtmlPart(27)
codecOut.print(hasErrors(bean: eventInstance, field: 'type', 'error'))
printHtmlPart(28)
invokeTag('message','g',127,['code':("event.type.label"),'default':("Type")],-1)
printHtmlPart(29)
codecOut.print(eventInstance?.type)
printHtmlPart(30)
codecOut.print(hasErrors(bean: eventInstance, field: 'kind', 'error'))
printHtmlPart(31)
invokeTag('message','g',139,['code':("event.kind.label"),'default':("Kind")],-1)
printHtmlPart(26)
invokeTag('select','g',145,['from':(['Paid', 'Free', 'Discounted']),'name':("kind"),'id':("kind"),'class':("form-control"),'value':(eventInstance?.kind)],-1)
printHtmlPart(32)
codecOut.print(hasErrors(bean: eventInstance, field: 'content', 'error'))
printHtmlPart(33)
invokeTag('message','g',153,['code':("event.content.label"),'default':("Content")],-1)
printHtmlPart(34)
invokeTag('select','g',158,['id':("content"),'name':("content.id"),'from':(EventItem.list()),'optionKey':("id"),'value':(eventInstance?.content?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: eventInstance, field: 'paymentServiceProvider', 'error'))
printHtmlPart(35)
invokeTag('message','g',166,['code':("event.paymentServiceProvider.label"),'default':("Payment Service Provider")],-1)
printHtmlPart(36)
codecOut.print(eventInstance?.paymentServiceProvider)
printHtmlPart(21)
codecOut.print(hasErrors(bean: eventInstance, field: 'eventSchedule', 'error'))
printHtmlPart(37)
invokeTag('message','g',177,['code':("event.eventSchedule.label"),'default':("Event Schedule")],-1)
printHtmlPart(38)
invokeTag('select','g',185,['id':("eventSchedule"),'name':("eventSchedule.id"),'from':(com.gangan.event.EventSchedule.list()),'optionKey':("id"),'value':(eventInstance?.eventSchedule?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(39)
codecOut.print(hasErrors(bean: eventInstance, field: 'category', 'error'))
printHtmlPart(40)
invokeTag('message','g',191,['code':("event.category.label"),'default':("Category")],-1)
printHtmlPart(41)
codecOut.print(eventInstance?.category)
printHtmlPart(42)
codecOut.print(hasErrors(bean: eventInstance, field: 'eventCategories', 'error'))
printHtmlPart(43)
invokeTag('message','g',202,['code':("event.eventCategories.label"),'default':("Event Categories")],-1)
printHtmlPart(44)
for( e in (eventInstance?.eventCategories ) ) {
printHtmlPart(45)
createTagBody(2, {->
codecOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',208,['controller':("eventCategory"),'action':("show"),'id':(e.id)],2)
printHtmlPart(46)
}
printHtmlPart(47)
createTagBody(1, {->
codecOut.print(message(code: 'default.add.label', args: [message(code: 'eventCategory.label', default: 'EventCategory')]))
})
invokeTag('link','g',215,['controller':("eventCategory"),'action':("create"),'params':(['event.id': eventInstance?.id])],1)
printHtmlPart(48)
codecOut.print(hasErrors(bean: eventInstance, field: 'eventContents', 'error'))
printHtmlPart(49)
invokeTag('message','g',221,['code':("event.eventContents.label"),'default':("Event Contents")],-1)
printHtmlPart(50)
for( e in (eventInstance?.eventItems ) ) {
printHtmlPart(45)
createTagBody(2, {->
codecOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',228,['controller':("eventContent"),'action':("show"),'id':(e.id)],2)
printHtmlPart(46)
}
printHtmlPart(47)
createTagBody(1, {->
codecOut.print(message(code: 'default.add.label', args: [message(code: 'eventContent.label', default: 'EventContent')]))
})
invokeTag('link','g',232,['controller':("eventContent"),'action':("create"),'params':(['event.id': eventInstance?.id])],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
