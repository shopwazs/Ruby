import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_ganganindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(resource(dir: 'images/icons',file: 'facebook.png'))
printHtmlPart(8)
})
invokeTag('link','g',27,['class':("btn btn-default btn-lg"),'controller':("signIn"),'action':("connectFacebook")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(resource(dir: 'images/icons',file: 'google.png'))
printHtmlPart(10)
})
invokeTag('link','g',34,['class':("btn btn-default btn-lg"),'controller':("signIn"),'action':("connectGoogle")],2)
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',46,['class':("btn btn-primary btn-lg"),'controller':("signIn"),'action':("signup")],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
