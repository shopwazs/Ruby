import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_layoutspublic_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/public.gsp" }
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
printHtmlPart(1)
invokeTag('layoutHead','g',9,[:],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(3)
codecOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(4)
invokeTag('layoutResources','r',15,[:],-1)
printHtmlPart(5)
codecOut.print(resource(dir: "/css", file: "smoothness-jquery-ui.css"))
printHtmlPart(6)
codecOut.print(resource(dir: "js", file: "jquery-1.10.2.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "jquery-ui.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "css", file: "style.css"))
printHtmlPart(9)
codecOut.print(resource(dir: "js", file: "jquery.MultiFile.js"))
printHtmlPart(10)
codecOut.print(resource(dir: "/css", file: "jquery.timepicker.css"))
printHtmlPart(6)
codecOut.print(resource(dir: "js", file: "datepair.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "jquery.timepicker.js"))
printHtmlPart(11)
codecOut.print(resource(dir: "css", file: "styleChoosen.css"))
printHtmlPart(12)
codecOut.print(resource(dir: "css", file: "prism.css"))
printHtmlPart(12)
codecOut.print(resource(dir: "css", file: "chosen.css"))
printHtmlPart(13)
codecOut.print(resource(dir: "js", file: "jquery.min.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "chosen.jquery.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "prism.js"))
printHtmlPart(14)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(15)
createTagBody(1, {->
printHtmlPart(16)
codecOut.print(createLink(controller: 'public', action: 'landing'))
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
codecOut.print(createLink(controller: 'public', action: 'faq'))
printHtmlPart(19)
codecOut.print(createLink(uri: '/'))
printHtmlPart(20)
codecOut.print(createLink(controller: 'manageEvent', action: 'publicEvents'))
printHtmlPart(21)
codecOut.print(createLink(controller: 'public', action: 'publicItemList'))
printHtmlPart(22)
})
invokeTag('ifNotLoggedIn','sec',78,[:],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(createLink(controller: 'manageEvent', action: 'list', params: [fromMyEvents: true]))
printHtmlPart(25)
codecOut.print(createLink(controller: 'vendor', action: 'itemList'))
printHtmlPart(26)
})
invokeTag('ifLoggedIn','sec',92,[:],2)
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
codecOut.print(createLink(controller: 'login', action: 'auth'))
printHtmlPart(29)
codecOut.print(createLink(controller: 'signIn', action: 'signup'))
printHtmlPart(30)
})
invokeTag('ifNotLoggedIn','sec',106,[:],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(createLink(controller: 'home', action: 'userDetails'))
printHtmlPart(31)
invokeTag('username','sec',108,[:],-1)
printHtmlPart(32)
codecOut.print(createLink(controller: 'logout', action: 'index'))
printHtmlPart(33)
})
invokeTag('ifLoggedIn','sec',113,[:],2)
printHtmlPart(34)
invokeTag('layoutBody','g',115,[:],-1)
printHtmlPart(35)
invokeTag('layoutResources','r',115,[:],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',115,['class':("home events new faq thumbs")],1)
printHtmlPart(36)
createClosureForHtmlPart(37, 1)
invokeTag('ifLoggedIn','sec',140,[:],1)
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
