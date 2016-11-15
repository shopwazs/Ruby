import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_publiclanding_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/public/landing.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
codecOut.print(createLink(controller: 'public',action: 'landing'))
printHtmlPart(7)
codecOut.print(createLink(controller: "manageEvent", action: "index"))
printHtmlPart(8)
codecOut.print(createLink(controller: 'signIn', action: 'signup'))
printHtmlPart(9)
codecOut.print(createLink(controller: 'login', action: 'auth'))
printHtmlPart(10)
codecOut.print(createLink(controller: 'manageEvent', action: 'index'))
printHtmlPart(11)
codecOut.print(createLink(controller: "manageEvent", action: "list"))
printHtmlPart(12)
codecOut.print(resource(dir: 'images/gfx', file: 'video.png'))
printHtmlPart(13)
codecOut.print(createLink(controller: "signIn", action: "signup"))
printHtmlPart(14)
codecOut.print(createLink(controller: "signIn", action: "connectGoogle"))
printHtmlPart(15)
codecOut.print(createLink(controller: "signIn", action: "connectFacebook"))
printHtmlPart(16)
codecOut.print(createLink(controller: "manageEvent",action: "index"))
printHtmlPart(17)
codecOut.print(createLink(controller: "manageEvent",action: "index"))
printHtmlPart(18)
codecOut.print(createLink(controller: "manageEvent",action: "list"))
printHtmlPart(19)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(21)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(20)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(22)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(23)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(23)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(23)
codecOut.print(resource(dir: 'images', file: 'gfx/event-default-pic.jpg'))
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',395,['class':("home")],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
