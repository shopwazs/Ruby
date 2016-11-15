import com.gangan.event.Category
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gangan_admin_categorycreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/admin/category/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'category.label', default: 'Category'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('render','g',12,['template':("/admin/category/categoryNavigation")],-1)
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(11)
codecOut.print(error.field)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('message','g',24,['error':(error)],-1)
printHtmlPart(14)
})
invokeTag('eachError','g',24,['bean':(categoryInstance),'var':("error")],3)
printHtmlPart(15)
})
invokeTag('hasErrors','g',24,['bean':(categoryInstance)],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('render','g',30,['template':("/admin/category/form"),'model':([categoryInstance: categoryInstance])],-1)
printHtmlPart(17)
invokeTag('submitButton','g',34,['name':("create"),'class':("btn btn-primary col-md-6 col-md-offset-6"),'value':(message(code: 'default.category.categoryName.label', default: 'Create category'))],-1)
printHtmlPart(18)
})
invokeTag('form','g',34,['action':("list")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',34,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392885824000L
public static final String DEFAULT_CODEC = null
}
