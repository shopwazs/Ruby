import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_ticketmanageTicket_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ticket/manageTicket.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',10,[:],-1)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('renderErrors','g',13,['bean':(ticketVO)],-1)
printHtmlPart(5)
})
invokeTag('hasErrors','g',15,['bean':(ticketVO)],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('select','g',27,['name':("category"),'from':(ticketCategoryList?.categoryName),'class':("form-control"),'style':("width: 100%;margin: 0em")],-1)
printHtmlPart(8)
codecOut.print(ticketVO?.ticketPrice)
printHtmlPart(9)
invokeTag('select','g',48,['name':("section"),'from':(sectionList?.sectionName),'class':("form-control"),'style':("width: 100%;margin: 0em")],-1)
printHtmlPart(10)
codecOut.print(ticketVO?.rowNumber)
printHtmlPart(11)
codecOut.print(ticketVO?.number)
printHtmlPart(12)
invokeTag('select','g',79,['name':("preOrderItem"),'from':(preOrderItemList?.itemName),'class':("form-control"),'style':("width: 100%;margin: 0em")],-1)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',86,['class':("btn btn-warning pull-right"),'controller':("manageEvent"),'action':("navigation"),'params':([eventId: eventId]),'style':("margin-top: 15px")],3)
printHtmlPart(15)
codecOut.print(eventId)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',96,['class':("btn btn-xs btn-default active col-md-4"),'controller':("home"),'action':("createTicketCategory"),'params':([eventId: eventId]),'style':("margin-left: 20px")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',99,['class':("btn btn-xs btn-default active col-md-5"),'controller':("home"),'action':("listTicketCategory"),'params':([eventId: eventId])],3)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',109,['class':("btn btn-xs btn-default active"),'controller':("home"),'action':("createSection"),'params':([eventId: eventId])],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',112,['class':("btn btn-xs btn-default active"),'controller':("home"),'action':("listTicketSection"),'params':([eventId: eventId])],3)
printHtmlPart(24)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',124,['class':("btn btn-xs btn-default active"),'controller':("home"),'action':("createPreOrderTicketItem"),'params':([eventId: eventId])],3)
printHtmlPart(22)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',127,['class':("btn btn-xs btn-default active "),'controller':("home"),'action':("listPreOrderTicketItem"),'params':([eventId: eventId])],3)
printHtmlPart(27)
if(true && (ticketList)) {
printHtmlPart(28)
for( ticket in (ticketList) ) {
printHtmlPart(29)
codecOut.print(ticket?.category)
printHtmlPart(30)
codecOut.print(ticket?.ticketPrice)
printHtmlPart(30)
codecOut.print(ticket?.section)
printHtmlPart(30)
codecOut.print(ticket?.rowNumber)
printHtmlPart(30)
codecOut.print(ticket?.number)
printHtmlPart(30)
createClosureForHtmlPart(31, 5)
invokeTag('link','g',202,['class':("btn btn-xs btn-default "),'controller':("home"),'action':("editTicket"),'params':([ticketId: ticket?.id, eventId: eventId]),'style':("color: #262626")],5)
printHtmlPart(32)
createClosureForHtmlPart(33, 5)
invokeTag('link','g',206,['class':("btn btn-xs btn-default"),'controller':("home"),'action':("deleteTicket"),'params':([ticketId: ticket?.id, eventId: eventId]),'style':("color: red")],5)
printHtmlPart(34)
}
printHtmlPart(35)
}
printHtmlPart(36)
})
invokeTag('form','g',213,['controller':("home"),'action':("createTicket")],2)
printHtmlPart(37)
})
invokeTag('captureBody','sitemesh',215,[:],1)
printHtmlPart(38)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
