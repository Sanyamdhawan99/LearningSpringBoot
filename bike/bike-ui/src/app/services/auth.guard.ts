import { temporaryDeclaration } from "@angular/compiler/src/compiler_util/expression_converter";
import { Injectable } from "@angular/core";
import { CanActivate } from "@angular/router";
import { AuthService } from "./auth.service";

@Injectable()
export class AuthGuard implements CanActivate {

    constructor(private authService: AuthService) {
    }

    canActivate() {
        if(this.authService.isAuthenticated()) {
            return true;
        }
        else {
            this.authService.login();
        }
    }

}