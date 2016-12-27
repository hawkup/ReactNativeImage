// ImageView.js

import { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'ReactNativeImage',
  propTypes: {
    borderRadius: PropTypes.number,
  },
};

module.exports = requireNativeComponent('ReactNativeImage', iface);
