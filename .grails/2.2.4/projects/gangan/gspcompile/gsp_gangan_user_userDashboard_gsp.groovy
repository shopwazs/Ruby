import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_user_userDashboard_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_userDashboard.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getName','gan',12,[:],-1)
printHtmlPart(1)
if(true && (user?.hasVerifiedEmail)) {
printHtmlPart(2)
codecOut.print(createLink(controller: 'home', action: 'dashboard'))
printHtmlPart(3)
}
else {
printHtmlPart(4)
}
printHtmlPart(5)
if(true && (user?.hasVerifiedEmail)) {
printHtmlPart(6)
codecOut.print(createLink(controller: 'manageEvent', action: 'navigation'))
printHtmlPart(7)
}
else {
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (user?.hasVerifiedEmail)) {
printHtmlPart(10)
}
else {
printHtmlPart(11)
}
printHtmlPart(9)
if(true && (user?.hasVerifiedEmail)) {
printHtmlPart(12)
codecOut.print(createLink(controller: 'public', action: 'searchUser'))
printHtmlPart(13)
}
else {
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (params.controller=='manageEvent')) {
printHtmlPart(16)
}
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
