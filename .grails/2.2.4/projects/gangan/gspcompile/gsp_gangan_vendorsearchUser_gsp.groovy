import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_vendorsearchUser_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/vendor/searchUser.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("public")],-1)
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
codecOut.print(flash.message)
printHtmlPart(6)
if(true && (name && vendorList)) {
printHtmlPart(7)
for( vendor in (vendorList) ) {
printHtmlPart(8)
createTagBody(5, {->
codecOut.print(vendor?.name)
})
invokeTag('link','g',39,['controller':("home"),'action':("showBasicVendor")],5)
printHtmlPart(9)
createTagBody(5, {->
codecOut.print(vendor?.email)
})
invokeTag('link','g',40,[:],5)
printHtmlPart(9)
codecOut.print(vendor?.city)
printHtmlPart(9)
codecOut.print(vendor?.country)
printHtmlPart(10)
}
printHtmlPart(11)
}
else {
printHtmlPart(12)
}
printHtmlPart(13)
})
invokeTag('form','g',49,['controller':("public"),'action':("searchUser"),'style':("height: 300px")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
