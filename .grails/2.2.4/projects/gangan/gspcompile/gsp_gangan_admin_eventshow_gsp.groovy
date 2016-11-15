import com.gangan.event.Event
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_eventshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/event/show.gsp" }
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
invokeTag('message','g',7,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('render','g',11,['template':("/admin/event/eventNavigation")],-1)
printHtmlPart(5)
invokeTag('message','g',15,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (eventInstance?.name)) {
printHtmlPart(10)
invokeTag('message','g',21,['code':("event.name.label"),'default':("Name")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',28,['bean':(eventInstance),'field':("name")],-1)
printHtmlPart(12)
}
printHtmlPart(3)
if(true && (eventInstance?.status)) {
printHtmlPart(13)
invokeTag('message','g',38,['code':("event.status.label"),'default':("Status")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',47,['bean':(eventInstance),'field':("status")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.description)) {
printHtmlPart(16)
invokeTag('message','g',57,['code':("event.description.label"),'default':("Description")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',67,['bean':(eventInstance),'field':("description")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.type)) {
printHtmlPart(18)
invokeTag('message','g',73,['code':("event.type.label"),'default':("Type")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',78,['bean':(eventInstance),'field':("type")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.kind)) {
printHtmlPart(20)
invokeTag('message','g',88,['code':("event.kind.label"),'default':("Kind")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',94,['bean':(eventInstance),'field':("kind")],-1)
printHtmlPart(22)
}
printHtmlPart(3)
if(true && (eventInstance?.occurrence)) {
printHtmlPart(23)
invokeTag('message','g',105,['code':("event.occurrence.label"),'default':("Occurrence")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',116,['bean':(eventInstance),'field':("occurrence")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.cost)) {
printHtmlPart(25)
invokeTag('message','g',124,['code':("event.cost.label"),'default':("Cost")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',130,['bean':(eventInstance),'field':("cost")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.discount)) {
printHtmlPart(27)
invokeTag('message','g',140,['code':("event.discount.label"),'default':("Discount")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',150,['bean':(eventInstance),'field':("discount")],-1)
printHtmlPart(29)
}
printHtmlPart(30)
if(true && (eventInstance?.startTime)) {
printHtmlPart(31)
invokeTag('message','g',157,['code':("event.startTime.label"),'default':("Start Time")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',169,['bean':(eventInstance),'field':("startTime")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.createdBy)) {
printHtmlPart(33)
invokeTag('message','g',175,['code':("event.createdBy.label"),'default':("Created By")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',185,['bean':(eventInstance),'field':("createdBy")],-1)
printHtmlPart(35)
}
printHtmlPart(3)
if(true && (eventInstance?.venue)) {
printHtmlPart(36)
invokeTag('message','g',191,['code':("event.venue.label"),'default':("Venue")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',199,['bean':(eventInstance),'field':("venue")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.startDate)) {
printHtmlPart(38)
invokeTag('message','g',207,['code':("event.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(39)
invokeTag('formatDate','g',214,['date':(eventInstance?.startDate)],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.content)) {
printHtmlPart(40)
invokeTag('message','g',220,['code':("event.content.label"),'default':("Content")],-1)
printHtmlPart(41)
createTagBody(3, {->
codecOut.print(eventInstance?.content?.encodeAsHTML())
})
invokeTag('link','g',232,['controller':("eventContent"),'action':("show"),'id':(eventInstance?.content?.id)],3)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.paymentServiceProvider)) {
printHtmlPart(42)
invokeTag('message','g',239,['code':("event.paymentServiceProvider.label"),'default':("Payment Service Provider")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',246,['bean':(eventInstance),'field':("paymentServiceProvider")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.paymentOptions)) {
printHtmlPart(44)
invokeTag('message','g',256,['code':("event.paymentOptions.label"),'default':("Payment Options")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',267,['bean':(eventInstance),'field':("paymentOptions")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.dateCreated)) {
printHtmlPart(46)
invokeTag('message','g',273,['code':("event.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(47)
invokeTag('formatDate','g',279,['date':(eventInstance?.dateCreated)],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.lastUpdated)) {
printHtmlPart(48)
invokeTag('message','g',288,['code':("event.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(49)
invokeTag('formatDate','g',295,['date':(eventInstance?.lastUpdated)],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.eventSchedule)) {
printHtmlPart(50)
invokeTag('message','g',304,['code':("event.eventSchedule.label"),'default':("Event Schedule")],-1)
printHtmlPart(51)
createTagBody(3, {->
codecOut.print(eventInstance?.eventSchedule?.encodeAsHTML())
})
invokeTag('link','g',317,['controller':("eventSchedule"),'action':("show"),'id':(eventInstance?.eventSchedule?.id)],3)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.category)) {
printHtmlPart(52)
invokeTag('message','g',322,['code':("event.category.label"),'default':("Category")],-1)
printHtmlPart(53)
invokeTag('fieldValue','g',330,['bean':(eventInstance),'field':("category")],-1)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.account)) {
printHtmlPart(54)
invokeTag('message','g',337,['code':("event.account.label"),'default':("Account")],-1)
printHtmlPart(55)
createTagBody(3, {->
codecOut.print(eventInstance?.account?.encodeAsHTML())
})
invokeTag('link','g',346,['controller':("account"),'action':("show"),'id':(eventInstance?.account?.id)],3)
printHtmlPart(15)
}
printHtmlPart(3)
if(true && (eventInstance?.eventCategories)) {
printHtmlPart(56)
invokeTag('message','g',353,['code':("event.eventCategories.label"),'default':("Event Categories")],-1)
printHtmlPart(57)
for( e in (eventInstance.eventCategories) ) {
printHtmlPart(58)
createTagBody(4, {->
codecOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',365,['controller':("eventCategory"),'action':("show"),'id':(e.id)],4)
printHtmlPart(59)
}
printHtmlPart(60)
}
printHtmlPart(3)
if(true && (eventInstance?.eventContents)) {
printHtmlPart(61)
invokeTag('message','g',371,['code':("event.eventContents.label"),'default':("Event Contents")],-1)
printHtmlPart(62)
for( e in (eventInstance.eventContents) ) {
printHtmlPart(63)
createTagBody(4, {->
codecOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',385,['controller':("eventContent"),'action':("show"),'id':(e.id)],4)
printHtmlPart(64)
}
printHtmlPart(65)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(66)
invokeTag('hiddenField','g',389,['name':("id"),'value':(eventInstance?.id)],-1)
printHtmlPart(67)
createTagBody(3, {->
invokeTag('message','g',390,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',390,['class':("btn btn-primary"),'action':("edit"),'id':(eventInstance?.id)],3)
printHtmlPart(67)
invokeTag('actionSubmit','g',401,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(68)
})
invokeTag('form','g',401,[:],2)
printHtmlPart(69)
})
invokeTag('captureBody','sitemesh',401,[:],1)
printHtmlPart(70)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
