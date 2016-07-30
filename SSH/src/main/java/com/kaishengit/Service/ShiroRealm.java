package com.kaishengit.Service;


import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;


import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ShiroRealm extends AuthorizingRealm{

    @Inject
    private UserService userService;


    /**
     * 验证用户是否具有某种权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
       User user = (User) principalCollection.getPrimaryPrincipal();
        if(user!=null){
            Integer roleid = user.getRole().getId();
            Role role = userService.findRoleByRoleid(roleid);
            //把角色的name赋给info
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            info.addRole(role.getName());
            return info;
        }
        return null;
    }

    /**
     * 验证用户账号密码是否正确
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String account = token.getUsername();
        User user = userService.findUserByName(account);
        System.out.println(user);
        //// TODO: 2016/7/30 账号是否要保持唯一

        if(user != null){
            if(!user.getEnable()){
                throw new LockedAccountException("账号已被禁用");
            }
            return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        }else {
            throw new UnknownAccountException("账号或密码错误");
        }
    }
}
