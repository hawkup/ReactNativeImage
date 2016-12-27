// ImageView.js

import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'ImageView',
  propTypes: {
    src: PropTypes.string,
  },
};

module.exports = requireNativeComponent('ReactNativeImage', iface);
