'use strict';

import React, {
    NativeModules,
} from 'react-native';

const UmengAppManager = NativeModules.UmengAppManager;

module.exports = {
    enterPage: UmengAppManager.enterPage,
    leavePage: UmengAppManager.leavePage
};
