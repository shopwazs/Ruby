import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
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
invokeTag('layoutHead','g',9,[:],-1)
printHtmlPart(1)
invokeTag('require','r',9,['module':("bootstrap")],-1)
printHtmlPart(3)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(4)
codecOut.print(resource(dir: "/css", file: "smoothness-jquery-ui.css"))
printHtmlPart(5)
codecOut.print(resource(dir: "js", file: "jquery-ui.js"))
printHtmlPart(6)
codecOut.print(resource(dir: "/css", file: "jquery.timepicker.css"))
printHtmlPart(5)
codecOut.print(resource(dir: "js", file: "datepair.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "jquery.timepicker.js"))
printHtmlPart(8)
codecOut.print(resource(dir: "css",file: "prism.css"))
printHtmlPart(9)
codecOut.print(resource(dir: "css",file: "chosen.css"))
printHtmlPart(10)
codecOut.print(resource(dir: "js", file: "chosen.jquery.js"))
printHtmlPart(7)
codecOut.print(resource(dir: "js", file: "prism.js"))
printHtmlPart(11)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(12)
createTagBody(1, {->
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
codecOut.print(createLink(controller: 'home', action: 'index'))
printHtmlPart(15)
codecOut.print(createLink(controller: 'home', action: 'editUserDetails'))
printHtmlPart(16)
codecOut.print(createLink(controller: 'manageEvent', action: 'list'))
printHtmlPart(17)
codecOut.print(createLink(controller: 'manageEvent', action: 'eventAttendingList'))
printHtmlPart(18)
codecOut.print(createLink(controller: 'manageEvent', action: 'publicEvents'))
printHtmlPart(19)
})
invokeTag('ifLoggedIn','sec',55,[:],2)
printHtmlPart(20)
createTagBody(2, {->
printHtmlPart(14)
codecOut.print(createLink(uri: '/'))
printHtmlPart(21)
codecOut.print(createLink(controller: 'manageEvent', action: 'publicEvents'))
printHtmlPart(22)
})
invokeTag('ifNotLoggedIn','sec',63,[:],2)
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(createLink(controller: 'signIn', action: 'signup'))
printHtmlPart(25)
})
invokeTag('ifNotLoggedIn','sec',71,[:],2)
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(createLink(controller: 'logout', action: 'index'))
printHtmlPart(27)
invokeTag('username','sec',75,[:],-1)
printHtmlPart(28)
})
invokeTag('ifLoggedIn','sec',77,[:],2)
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(createLink(controller: 'login', action: 'auth'))
printHtmlPart(30)
})
invokeTag('ifNotLoggedIn','sec',81,[:],2)
printHtmlPart(31)
invokeTag('layoutBody','g',83,[:],-1)
printHtmlPart(32)
invokeTag('message','g',90,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(33)
invokeTag('javascript','g',90,['library':("application")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',90,[:],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',90,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
