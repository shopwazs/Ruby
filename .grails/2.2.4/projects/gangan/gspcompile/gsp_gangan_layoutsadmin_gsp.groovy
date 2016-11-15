import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_layoutsadmin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/admin.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',8,['default':("E-Gangan")],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
invokeTag('layoutHead','g',11,[:],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(4)
codecOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(5)
invokeTag('layoutResources','r',17,[:],-1)
printHtmlPart(6)
codecOut.print(resource(dir: "/css", file: "smoothness-jquery-ui.css"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "jquery-1.10.2.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "js", file: "jquery-ui.js"))
printHtmlPart(9)
codecOut.print(resource(dir: "css", file: "style.css"))
printHtmlPart(10)
codecOut.print(resource(dir: "js", file: "jquery.MultiFile.js"))
printHtmlPart(11)
codecOut.print(resource(dir: "/css", file: "jquery.timepicker.css"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "datepair.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "js", file: "jquery.timepicker.js"))
printHtmlPart(12)
codecOut.print(resource(dir: "css", file: "styleChoosen.css"))
printHtmlPart(13)
codecOut.print(resource(dir: "css", file: "prism.css"))
printHtmlPart(13)
codecOut.print(resource(dir: "css", file: "chosen.css"))
printHtmlPart(14)
codecOut.print(resource(dir: "js", file: "jquery.min.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "js", file: "chosen.jquery.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "js", file: "prism.js"))
printHtmlPart(15)
})
invokeTag('captureHead','sitemesh',38,[:],1)
printHtmlPart(16)
createTagBody(1, {->
printHtmlPart(17)
codecOut.print(createLink(controller: 'event', action: 'list'))
printHtmlPart(18)
codecOut.print(createLink(controller: 'category', action: 'list'))
printHtmlPart(19)
codecOut.print(createLink(controller: 'user', action: 'list'))
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(21)
codecOut.print(createLink(controller: 'login', action: 'auth'))
printHtmlPart(22)
codecOut.print(createLink(controller: 'signIn', action: 'signup'))
printHtmlPart(23)
})
invokeTag('ifNotLoggedIn','sec',78,[:],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
codecOut.print(createLink(controller: 'home', action: 'userDetails'))
printHtmlPart(26)
invokeTag('username','sec',80,[:],-1)
printHtmlPart(27)
codecOut.print(createLink(controller: 'logout', action: 'index'))
printHtmlPart(28)
})
invokeTag('ifLoggedIn','sec',85,[:],2)
printHtmlPart(29)
invokeTag('layoutBody','g',86,[:],-1)
printHtmlPart(30)
invokeTag('layoutResources','r',86,[:],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',86,['class':("home events new faq thumbs")],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
