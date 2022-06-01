/**
 *     Copyright (C) 2019-2020 Ubiqube.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.ubiqube.etsi.mano.config;

import java.security.KeyStore;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.SslStoreProvider;

/**
 * This provider can load data from anywhere.
 *
 * @author Olivier Vignaud <ovi@ubiqube.com>
 *
 */
public class ManoSslStoreProvider implements SslStoreProvider {

	private static final Logger LOG = LoggerFactory.getLogger(ManoSslStoreProvider.class);
	private final DataSource ds;

	public ManoSslStoreProvider(final DataSource ds) {
		this.ds = ds;
	}

	@Override
	public KeyStore getKeyStore() throws Exception {
		LOG.error("=============================> getstore");
		return null;
	}

	@Override
	public KeyStore getTrustStore() throws Exception {
		LOG.error("=============================> getTruststore");
		return null;
	}

}