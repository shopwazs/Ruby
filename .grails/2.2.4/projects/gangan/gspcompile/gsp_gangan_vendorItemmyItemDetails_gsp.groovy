import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorItemmyItemDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendorItem/myItemDetails.gsp" }
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
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
if(true && (shoppingRecordList)) {
printHtmlPart(6)
for( shoppingRecord in (shoppingRecordList) ) {
printHtmlPart(7)
codecOut.print(shoppingRecord?.vendor?.name)
printHtmlPart(8)
codecOut.print(shoppingRecord?.itemName)
printHtmlPart(8)
codecOut.print(shoppingRecord?.uniqueId)
printHtmlPart(8)
codecOut.print(shoppingRecord?.price)
printHtmlPart(8)
codecOut.print(shoppingRecord?.discount)
printHtmlPart(8)
codecOut.print(shoppingRecord?.subTotal)
printHtmlPart(9)
}
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('form','g',76,['class':("form-control well"),'controller':("home"),'action':("myItemDetails"),'method':("post"),'style':("height: 400px;width: 1000px")],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',76,[:],1)
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
