import com.gangan.home.Address
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_useruserDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/userDetails.gsp" }
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
printHtmlPart(2)
invokeTag('userVerifyEmail','gan',8,[:],-1)
printHtmlPart(2)
invokeTag('dashboard','gan',9,[:],-1)
printHtmlPart(4)
codecOut.print(flash.message)
printHtmlPart(5)
codecOut.print(flash.clear())
printHtmlPart(6)
codecOut.print(createLink(controller: 'home', action: 'showProfilePicture', params: [userId: "${user?.id}"]))
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('form','g',30,['controller':("home"),'action':("updateProfilePicture"),'enctype':("multipart/form-data")],2)
printHtmlPart(9)
if(true && (account.vendor)) {
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',40,['class':("btn btn-xs btn-primary disabled")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',41,['class':("btn btn-xs btn-primary disabled")],3)
printHtmlPart(14)
}
else {
printHtmlPart(15)
}
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',71,['class':("btn btn-primary col-md-6"),'action':("editUserDetails"),'controller':("home")],2)
printHtmlPart(18)
codecOut.print(user?.name)
printHtmlPart(19)
codecOut.print(user?.username)
printHtmlPart(20)
createClosureForHtmlPart(21, 2)
invokeTag('link','g',105,['controller':("home"),'action':("addPhoneNumber"),'style':("float:left;")],2)
printHtmlPart(22)
if(true && (user?.country)) {
printHtmlPart(23)
invokeTag('country','g',119,['code':(user?.country)],-1)
printHtmlPart(24)
}
printHtmlPart(25)
codecOut.print(user?.gender)
printHtmlPart(26)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',148,['class':("btn btn-primary col-md-6"),'action':("createAddress"),'controller':("home")],2)
printHtmlPart(28)
for( address in (Address.findAllByAccount(account)) ) {
printHtmlPart(29)
codecOut.print(address?.name)
printHtmlPart(30)
codecOut.print(address?.city)
printHtmlPart(30)
invokeTag('country','g',165,['code':(address?.country)],-1)
printHtmlPart(31)
}
printHtmlPart(32)
createClosureForHtmlPart(33, 2)
invokeTag('link','g',182,['class':("btn btn-danger col-md-6"),'action':("deleteAccount"),'controller':("home")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',190,[:],1)
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
