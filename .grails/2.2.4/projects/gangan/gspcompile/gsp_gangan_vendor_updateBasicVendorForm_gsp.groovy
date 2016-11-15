import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendor_updateBasicVendorForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/_updateBasicVendorForm.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
codecOut.print(vendor?.name)
printHtmlPart(1)
createClosureForHtmlPart(2, 2)
invokeTag('link','g',14,['controller':("vendor"),'action':("createVendorItem"),'style':("height: 32px;float: right"),'name':("createItem"),'class':("btn btn-primary col-md-2")],2)
printHtmlPart(3)
codecOut.print(vendor?.email)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
codecOut.print(shoppingRecordList)
printHtmlPart(6)
})
invokeTag('link','g',30,['controller':("vendor"),'action':("#"),'style':("height: 30px;float: right"),'name':("CurrentItem"),'class':("btn btn-primary col-md-2")],2)
printHtmlPart(7)
codecOut.print(vendor?.city)
printHtmlPart(8)
for( categories in (publicCategoryList) ) {
printHtmlPart(9)
codecOut.print(categories?.categoryName)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('countrySelect','g',68,['name':("country"),'class':("form-control"),'id':("country"),'value':(vendor?.country)],-1)
printHtmlPart(12)
})
invokeTag('form','g',85,['role':("form"),'controller':("home"),'action':("updateBasicVendor"),'method':("post")],1)
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
