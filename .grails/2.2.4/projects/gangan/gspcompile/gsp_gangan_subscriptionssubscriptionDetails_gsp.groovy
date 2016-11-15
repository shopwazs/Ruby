import com.gangan.social.AccountType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_subscriptionssubscriptionDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/subscriptions/subscriptionDetails.gsp" }
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
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('userVerifyEmail','gan',9,[:],-1)
printHtmlPart(4)
invokeTag('render','g',11,['template':("/account/profileNavigation"),'model':([account: account])],-1)
printHtmlPart(5)
if(true && (account?.vendor == null)) {
printHtmlPart(6)
}
else {
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (account?.vendor == null)) {
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',36,['controller':("home"),'action':("createBasicVendor"),'class':("btn btn-xs btn-primary")],3)
}
else {
printHtmlPart(9)
if(true && (account?.typeBasic == AccountType.BASIC)) {
printHtmlPart(11)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',40,['controller':("home"),'action':("showBasicVendor"),'class':("btn btn-xs btn-primary")],4)
printHtmlPart(12)
if(true && (vendor.hasVerifiedEmail == 'true')) {
printHtmlPart(13)
createClosureForHtmlPart(10, 5)
invokeTag('link','g',44,['controller':("home"),'action':("showBasicVendor"),'class':("btn btn-xs btn-primary")],5)
printHtmlPart(11)
}
printHtmlPart(14)
}
else {
printHtmlPart(11)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',50,['controller':("home"),'action':("showBasicVendor"),'class':("btn btn-xs btn-primary")],4)
printHtmlPart(9)
}
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (account?.vendor == null)) {
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',71,['controller':("home"),'action':("createPremiumVendor"),'class':("btn btn-xs btn-primary")],3)
}
else {
printHtmlPart(9)
if(true && (account?.typeBasic == AccountType.PREMIUM)) {
printHtmlPart(11)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',78,['controller':("home"),'action':("showPremiumVendor"),'class':("btn btn-xs btn-primary")],4)
printHtmlPart(9)
}
else {
printHtmlPart(11)
createClosureForHtmlPart(10, 4)
invokeTag('link','g',82,['controller':("home"),'action':("createPremiumVendor"),'class':("btn btn-xs btn-primary")],4)
printHtmlPart(9)
}
printHtmlPart(15)
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('select','g',132,['from':(["All", "Noida", "Delhi"]),'type':("text"),'name':("location"),'class':("form-control"),'style':("width: 170px;margin-top: 0em")],-1)
printHtmlPart(19)
invokeTag('select','g',146,['from':(["Once in week", "Everyday", "Once in year"]),'name':("howOften"),'class':("form-control"),'style':("width: 170px;margin-top: 0em")],-1)
printHtmlPart(20)
invokeTag('select','g',157,['from':(["Only the best result"]),'name':("howMuch"),'class':("form-control"),'style':("width: 170px;margin-top: 0em")],-1)
printHtmlPart(21)
invokeTag('select','g',167,['from':(["egangan@gmail.com"]),'name':("to"),'class':("form-control"),'style':("width: 170px;margin-top: 0em")],-1)
printHtmlPart(22)
})
invokeTag('form','g',178,['controller':("home"),'action':("createNotificationSubscription"),'method':("post")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',184,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
