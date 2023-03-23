package com.example.hnspringboot.controller;

import com.example.hnspringboot.pojo.AdminRole;
import com.example.hnspringboot.result.Result;
import com.example.hnspringboot.result.ResultFactory;
import com.example.hnspringboot.service.AdminPermissionService;
import com.example.hnspringboot.service.AdminRoleMenuService;
import com.example.hnspringboot.service.AdminRolePermissionService;
import com.example.hnspringboot.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Role controller.
 *
 * @author Evan
 * @date 2019/11
 */
@RestController
public class RoleController {
    @Autowired
    AdminRoleService adminRoleService;
    @Autowired
    AdminPermissionService adminPermissionService;
    @Autowired
    AdminRolePermissionService adminRolePermissionService;
    @Autowired
    AdminRoleMenuService adminRoleMenuService;

    @GetMapping("/api/admin/role")
    public Result listRoles() {
        return ResultFactory.buildSuccessResult(adminRoleService.listWithPermsAndMenus());
    }

    @PutMapping("/api/admin/role/status")
    public Result updateRoleStatus(@RequestBody AdminRole requestRole) {
        AdminRole adminRole = adminRoleService.updateRoleStatus(requestRole);
        String message = "用户" + adminRole.getNameZh() + "状态更新成功";
        return ResultFactory.buildSuccessResult(message);
    }

    @PutMapping("/api/admin/role")
    public Result editRole(@RequestBody AdminRole requestRole) {
        adminRoleService.addOrUpdate(requestRole);
        adminRolePermissionService.savePermChanges(requestRole.getId(), requestRole.getPerms());
        String message = "修改角色信息成功";
        return ResultFactory.buildSuccessResult(message);
    }


    @PostMapping("/api/admin/role")
    public Result addRole(@RequestBody AdminRole requestRole) {
        adminRoleService.editRole(requestRole);
        return ResultFactory.buildSuccessResult("修改用户成功");
    }

    @GetMapping("/api/admin/role/perm")
    public Result listPerms() {
        return ResultFactory.buildSuccessResult(adminPermissionService.list());
    }

    @PutMapping("/api/admin/role/menu")
    public Result updateRoleMenu(@RequestParam int rid, @RequestBody Map<String, List<Integer>> menusIds) {
        adminRoleMenuService.updateRoleMenu(rid, menusIds);
        return ResultFactory.buildSuccessResult("更新成功");
    }
}
